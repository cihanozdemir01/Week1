package Private.BitirmeProjesi.MineSweeper;
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {

    int rowNumber;
    int colNumber;
    int rowUserNumber;
    int colUserNumber;
    int size;
    String [][] devMap;
    String [][] userMap;
    boolean game = true;
    boolean repeat = false;

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    //Değerlendirme formu 7 - Row and column data that will form the matrix are received from the user.
    MineSweeper(){

        do {
            if (repeat) {
                System.out.println("Hatalı Veri Girişi");
                System.out.println("Minimum 2x2 matrisi girişine izin verilmektedir.");
                System.out.println();
            }
            System.out.println("MAYIN TARLASI OYUNUNA HOŞ GELDİNİZ");
            System.out.println("==================================");
            System.out.println("Lütfen oluşturmak istediğiniz matrisin satır ve sütun sayısını giriniz.");
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("Satır sayısı : ");
            this.rowNumber = input.nextInt();
            System.out.print("Sütun sayısı : ");
            this.colNumber = input.nextInt();
            repeat = true;

        }while(rowNumber < 2 && colNumber < 2);

        this.devMap = new String[rowNumber][colNumber];
        this.userMap = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }
    // Matrices that the developer and user can see are created with the matrix values received from the user.
    // Mines are placed.
    public void run(){
        createMap(devMap);
        createMap(userMap);
        placeMines(devMap,(size/4));
        System.out.println("Developer Map");
        System.out.println("=============");
        printMap(devMap);
        System.out.println("Oyun Başladı");
        System.out.println("=============");
        playGame();
    }
    // Bir dizi istenilerek matris oluşturulur.
    public void createMap(String[][] map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = " - ";
            }
        }
    }
    // Değerlendirme formu 8 - Mines are placed in a matrix by requesting a set and specifying random values.
    public void placeMines(String[][] map, int numMines) {
        int count = 0;
        while (count < numMines) {
            int rndRow = random.nextInt(map.length);
            int rndCol = random.nextInt(map[0].length);
            if (!map[rndRow][rndCol].equals(" * ")) {
                map[rndRow][rndCol] = " * ";
                count++;
            }
        }
    }
    //By requesting an array, the matrix is displayed to the user.
    public void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    // Değerlendirme formu 9 - String values that will start the game are received from the user.
    public void getUserInput() {
        do {
            System.out.println("Dizinin sınırları içerisinde sayı giriniz. Satır numarasını 0 ile " + (rowNumber-1) + " arasında, Sütun numarasını 0 ile " + (colNumber-1) + " arasında girebilirsiniz.");
            System.out.println();
            System.out.print("Satır sayısı : ");
            rowUserNumber=input.nextInt();
            System.out.print("Sütun sayısı : ");
            colUserNumber=input.nextInt();
            System.out.println("=============");

        // Değerlendirme formu 10 - And a control is added and a text is requested to enter the correct data.
        } while(rowUserNumber >= rowNumber || rowUserNumber < 0 || colUserNumber >= colNumber || colUserNumber < 0);
    }

    public void playGame() {

        while (game) {
            //Değerlendirme formu 11 - The user area is printed as long as the game continues.
            printMap(userMap);
            System.out.println("=============");
            getUserInput();

            // Değerlendirme formu 13 - If there is a mine in the array cell selected according to the values entered by the user,
            // it is stated that the game is lost. And the game is stopped.
            if (devMap[rowUserNumber][colUserNumber].equals(" * ")) {
                System.out.println(" Oyunu kaybettiniz.");
                game = false;
            } else {
                int count = countAdjacentMines(rowUserNumber,colUserNumber);
                userMap[rowUserNumber][colUserNumber] = " " + count + " ";
                if (count == 0 ) {
                    checkAdjacentCells(rowUserNumber,colUserNumber);
                }// Değerlendirme formu 15 - When the method in the condition returns true, a message is sent to the user.
                if (isGameWon()) {
                    System.out.println("Oyunu kazandınız.");
                    printMap(userMap);
                    game=false;
                }
            }
        }
    }
    // Değerlendirme formu 12 - If there are no mines in the area where the user steps,
    // the cells around are searched and the number of mines is written into the pressed cell.
    public int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++ ) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber && devMap[i][j].equals(" * ")) {
                    count++;
                }
            }
        }
        return count;
    }
    // If there are mines in the surrounding cells, it writes the number of mines.
    // If not, it searches the other cells around it by calling the same method again.
    public void checkAdjacentCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber && userMap[i][j].equals(" - ")) {
                    int count = countAdjacentMines(i,j);
                    userMap[i][j] = " " + count + " ";
                    if (count == 0) {
                        checkAdjacentCells(i,j);
                    }
                }
            }
        }
    }
    // Değerlendirme formu 14 - If there are as many cells to select as there are mines, the method returns true.
    public boolean isGameWon() {
        int count = 0;
        for (int i = 0; i < userMap.length; i++) {
            for (int j = 0; j < userMap[0].length; j++) {
                if (userMap[i][j].equals(" - ")){
                    count++;
                }
            }
        }
        return count == size/4;
    }
}
