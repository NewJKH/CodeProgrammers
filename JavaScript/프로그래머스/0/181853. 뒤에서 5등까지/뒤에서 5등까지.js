// 정렬하면 쉽게 풀 수 있지만... 패스

function solution(num_list) {
    var answer = [];
    var value = 100;
    
    for ( let i = 0; i < 5; i++){
        var val = 100;
        var checkPoint = 0;
        for ( let j = 0; j<num_list.length; j++){
            if ( val > num_list[j] ){
                val = num_list[j];
                checkPoint = j;
            }
        }
        answer[i] = val;
        num_list[checkPoint] = 100;
    }
    
    return answer;
}