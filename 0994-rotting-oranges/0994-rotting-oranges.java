class Solution {
    public int orangesRotting(int[][] arr) {
        class Triplet {
            int row;
            int col;
            int time;

            Triplet(int row, int col, int time) {
                this.row = row;
                this.col = col;
                this.time = time;
            }
        }

        int m = arr.length;
        int n = arr[0].length;

        Queue<Triplet> q = new LinkedList<>();
        int maxTime = 0;

        // Add all initially rotten oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 2) {
                    q.add(new Triplet(i, j, 0));
                }
            }
        }

        // Multi-source BFS
        while (!q.isEmpty()) {
            Triplet front = q.poll();

            int row = front.row;
            int col = front.col;
            int time = front.time;

            maxTime = Math.max(maxTime, time);

            // Left
            if (col - 1 >= 0 && arr[row][col - 1] == 1) {
                arr[row][col - 1] = 2;
                q.add(new Triplet(row, col - 1, time + 1));
            }

            // Right
            if (col + 1 < n && arr[row][col + 1] == 1) {
                arr[row][col + 1] = 2;
                q.add(new Triplet(row, col + 1, time + 1));
            }

            // Up
            if (row - 1 >= 0 && arr[row - 1][col] == 1) {
                arr[row - 1][col] = 2;
                q.add(new Triplet(row - 1, col, time + 1));
            }

            // Down
            if (row + 1 < m && arr[row + 1][col] == 1) {
                arr[row + 1][col] = 2;
                q.add(new Triplet(row + 1, col, time + 1));
            }
        }

        // Check for fresh oranges remaining
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    return -1;
                }
            }
        }

        return maxTime;
    }
}