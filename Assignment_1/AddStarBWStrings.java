//13. Given a String , find the adjacent element if it is same as the previous element so add the star in between
// eg. "aabbcc"
// output: a*ab*bc*c
class AddStarBWStrings{
    public static void main(String[] args) {
        String str = "aabbccdd";
        addStar(str,0,new StringBuffer());
        System.out.println(addStar2(str,0));
    }

    //without return type function
    //Stack Building approach
    static void addStar(String str,int character,StringBuffer sb){
        if(character == str.length()-1){
            sb.append(str.charAt(character));
            System.out.println(sb);
            return;
        }
        if(str.charAt(character) == str.charAt(character+1)){
            sb.append(str.charAt(character));
            sb.append("*");
        }else{
            sb.append(str.charAt(character));
        }
        addStar(str,character+1,sb);
    }


    //using return type function
    //Stack Falling approach
    static StringBuilder addStar2(String str,int character){
        if(character == str.length()-1){
            StringBuilder sb = new StringBuilder();
            sb.append(str.charAt(character));
            return sb;
        }
        StringBuilder sb = addStar2(str, character+1);

        if(str.charAt(character) == sb.charAt(0)){
            sb.insert(0,"*");
        }
        sb.insert(0,str.charAt(character));
        return sb;
    }
}