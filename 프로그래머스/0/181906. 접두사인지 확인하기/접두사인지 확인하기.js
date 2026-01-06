function solution(my_string, is_prefix) {
    for ( let i = 0; i<is_prefix.length; i++ ){
            var ic = is_prefix[i];
            var mc = my_string[i];
            if ( mc == null ){
                return 0;
            }

            if ( ic != mc ){
                return 0;
            }
    }
    return 1;
}