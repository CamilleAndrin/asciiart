package com.camille.asciiart;

public class ApplicationAsciiArt {
	
	public static final string 

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        T = T.toUpperCase();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            System.err.println(ROW);

            // char maj 65 => 90
            for(char letter : T.toCharArray()){
                if(letter >= 65 && letter <= 90){
                    builder.append(ROW.substring((letter-65)L,(letter-65)L+L));
                }else{
                    builder.append(ROW.substring(L26,(L26)+L));
                }

            }
            builder.append("\n");
        }

        System.out.println(builder.toString());

	}

}
