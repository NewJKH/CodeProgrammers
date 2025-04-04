class Solution {
    public String solution(String my_string) {
        my_string = cut(my_string,"a");
        my_string = cut(my_string,"e");
        my_string = cut(my_string,"i");
        my_string = cut(my_string,"o");
        my_string = cut(my_string,"u");
      
        return my_string;
    }
    public String cut(String my_string, String word){
        if ( my_string.contains(word) ){
			my_string = my_string.replace(word,"");
		}
        return my_string;
    }
}