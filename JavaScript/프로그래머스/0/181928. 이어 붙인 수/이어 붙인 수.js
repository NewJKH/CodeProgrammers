function solution(num_list) {
    var a = 0;
    var b = 0;
    
    for (let i=0; i<num_list.length; i++){
        if ( num_list[i] % 2 == 0 ){
            a*=10;
            a+=num_list[i];
        }
        else{
            b*=10;
            b+=num_list[i];
        }
    }
    console.log(a);
    console.log(b);
  
    
    
    return a+b;
}