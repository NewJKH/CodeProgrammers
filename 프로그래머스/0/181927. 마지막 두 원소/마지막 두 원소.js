function solution(num_list) {
    var answer = [];
    
    var len = num_list.length;
    var a = num_list[len-2];
    var b = num_list[len-1];
    
    if ( a >= b ){
        num_list.push(b*2);
    }else {   
        num_list.push(b-a);
    }
    
    
    
    return num_list;
}