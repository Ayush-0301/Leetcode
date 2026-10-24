class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean [] visited= new boolean [n];
        int count = 0;
        for(int i =0;i<n;i++){
            if(!visited[i]) {
                visited[i] = true;
                bfs(i,visited,isConnected);
                count++;
            }
        } 
        return count;
    }
    static void bfs(int i, boolean []visited, int[][] connected){
        int n = connected.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        while(q.size() > 0){
            int front = q.poll();
            for(int j = 0 ;j<n;j++){
                if(connected[front][j] == 1 && visited[j] == false){
                    q.add(j);
                    visited[j] = true;

                }
            }
        }
    }
}