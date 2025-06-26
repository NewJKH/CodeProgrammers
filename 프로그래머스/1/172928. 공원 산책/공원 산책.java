import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        List<Move> moveList = initMoveList(routes);
        int[] start = new int[2];

        for (int i = 0; i < park.length; i++) {
            String s = park[i];
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if ( c == 'S' ) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }


        for (Move move : moveList) {
            char dir = move.getOp();
            int amount = move.getMove();

            int ny = start[0];
            int nx = start[1];
            boolean blocked = false;

            for (int step = 1; step <= Math.abs(amount); step++) {
                int dy = 0, dx = 0;
                if (dir == 'E' || dir == 'W') dx = Integer.signum(amount);
                else dy = Integer.signum(amount);

                ny += dy;
                nx += dx;
                
                if (ny < 0 || ny >= park.length || nx < 0 || nx >= park[0].length()) {
                    blocked = true;
                    break;
                }
                
                if (park[ny].charAt(nx) == 'X') {
                    blocked = true;
                    break;
                }
            }

            if (!blocked) {
                start[0] = ny;
                start[1] = nx;
            }
        }
        return start;
    }

    private List<Move> initMoveList(String[] routes) {
        List<Move> list = new ArrayList<>();
        for (String route : routes) {
            char op = route.charAt(0);
            int move = Integer.parseInt(route.substring(2));
            if ( op == 'W' || op == 'N' ) move*=-1;

            list.add(new Move(op,move));
        }
        return list;
    }

     class Move {
        char op;
        int move;

        public Move(char op, int move) {
            this.op = op;
            this.move = move;
        }

        public char getOp() {
            return op;
        }

        public int getMove() {
            return move;
        }
    }
}