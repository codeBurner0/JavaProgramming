import java.util.HashMap;

class cp{
    public static void main(String[] args) {
        canConstruct("aa", "aab");
    }
        // int k=20;
        // if(k){
        //     System.out.println("Yes");
        // }
        // System.out.println(k);
        // .length is not a method, afiled of array
        


        
        // boolean c=a>=10 & b<20;
        // System.out.println(c);
        public static boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<ransomNote.length();i++){
                map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
            }
            for(int i=0;i<magazine.length();i++){
                if(map.containsKey(magazine.charAt(i))){
                    map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
                }
            }
            for(int i=0;i<ransomNote.length();i++){
                if(map.get(ransomNote.charAt(i))>0){
                    return false;
                }
                // System.out.println(map.get(ransomNote.charAt(i)));
            }
                 
        return true;
        }
}