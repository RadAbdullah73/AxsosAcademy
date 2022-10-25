import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
class Puzzle {
    public ArrayList <Integer> getTenRolls(){
        ArrayList <Integer> ourArr = new ArrayList <Integer>();
       
        for (Integer i=0 ; i<10 ; i++){
            Random rnd = new Random();
            ourArr.add(rnd.nextInt(21));
            
            }
        return ourArr;
    }
    public char getRandomLetter(){
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random rnd = new Random();
        int Rand = rnd.nextInt(26);
        return arr[Rand] ; 
        }
        public String generatePassword(){
            char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            String Pass = "";
            for (Integer i=0 ; i<8 ; i++){
                Random rnd = new Random();
            int Rand = rnd.nextInt(26);
            Pass+=arr[Rand];
            }
            return Pass ;
        }
        public ArrayList <Character> getNewPasswordSet(int lenArr){
            ArrayList <Character> array = new ArrayList <Character>() ;
            char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            for (Integer i=0 ; i<lenArr ;  i++){
                Random rnd = new Random();
                int Rand = rnd.nextInt(26);
                array.add(arr[Rand]);
            }
            return array ;

        }


    }
