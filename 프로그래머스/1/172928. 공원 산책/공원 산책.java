class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) { 
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] command = routes[i].split(" ");
            String direction = command[0];
            int distance = Integer.parseInt(command[1]);

            int dx = 0;
            int dy = 0;

            switch (direction) {
                case "N":
                    dy = -1;
                    break;
                case "S":
                    dy = 1;
                    break;
                case "W":
                    dx = -1;
                    break;
                case "E":
                    dx = 1;
                    break;
            }

            boolean canMove = true;
            int tempX = x;
            int tempY = y;

            for (int k = 0; k < distance; k++) {
                tempX += dy;
                tempY += dx;

                if (tempX < 0 || tempX >= park.length || tempY < 0 || tempY >= park[0].length()) {
                    canMove = false;
                    break;
                }

                if (park[tempX].charAt(tempY) == 'X') {
                    canMove = false;
                    break;
                }
            }
            
            if (canMove) {
                x = tempX;
                y = tempY;
            }
        }

        int[] answer = {x, y};
        return answer;
    }
}