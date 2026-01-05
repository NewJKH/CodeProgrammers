function solution(a, b, n, m) {
    var answer = 0;
    var bool = true;
    
    if ( a==">" ){
        if ( b == "=" ){
            bool = n>=m;
        }else{
            bool = n>m;
        }
    }else {
        if ( b == "=" ){
            bool = n<=m;
        }else{
            bool = n<m;
        }
    }
    return bool ? 1:0;
}