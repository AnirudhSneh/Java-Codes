public class StarPattern {
    public static void main(String args[]){
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){//nested loops.
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");
        int n = 4;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){//inverted star pattern using n-i+1.
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*To print star pattern- 1- See lines (4) which means outer loop 4 times.
 * 2- number of times (i) -inner loop i times.
 * 3- What to print?
*/