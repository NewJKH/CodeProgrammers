function solution(n_str) {
    for ( let i = 0; i<n_str.length; i++){
        if ( n_str[i] == '0'){
            n_str-=n_str[i];
        }else{
            break;
        }
    }
    return String(Number(n_str));
}