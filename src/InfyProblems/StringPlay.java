package InfyProblems;


class Definations {
    public static class StringMethods{
         public String getUnique(String str){
             String s = str.replaceAll(" ","");
             char[] ch = s.toCharArray();
             StringBuilder sb = new StringBuilder();
             for (int i = 0; i < ch.length; i++) {
                 int count = 0;
                 for (int j = 0; j < ch.length ; j++) {
                     if(ch[i] != ch[j] && i!=j) count++;
                 }
                 if (count == ch.length-1) sb.append(ch[i]);
             }
             return sb.toString();
         }
         public String getDuplicate(String str){
             String s = str.replaceAll(" ","");
             char[] ch = s.toCharArray();
             StringBuilder sb = new StringBuilder();
             for (int i = 0; i < ch.length; i++) {
                 int count = 0;
                 for (int j = i+1; j < ch.length ; j++) {
                     if(ch[i] == ch[j]) count++;
                 }
                 if (count > 0) sb.append(ch[i]);
             }

             return sb.toString();
         }
         public String getVowel(String str){
             StringBuilder sb = new StringBuilder();
             String s = str.replaceAll(" ","");
             char[] ch = s.toCharArray();
             String vowel = "aeiouAEIOU";
             for (char c : ch) {
                 for (int j = 0; j < vowel.length(); j++) {
                     if (c == vowel.charAt(j)) sb.append(c);
                 }
             }
             for (int i = 0; i < sb.length(); i++) {
                 for (int j = 0; j < sb.length(); j++) {
                     if(sb.charAt(i) == sb.charAt(j) && i!=j) sb.deleteCharAt(j);
                 }
             }
             return sb.toString();
         }
     }

    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        String str = "Hello this is mahadev";
        String result = sm.getUnique(str);
        System.out.println(result);
        result = sm.getDuplicate(str);
        System.out.println(result);
        result = sm.getVowel(str);
        System.out.println(result);

    }
}
