class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int count=0;
        boolean visited[]=new boolean[n];
        Queue<Integer>qw=new ArrayDeque<>();
        visited[0]=true;
        qw.offer(0);
        while(qw.size()!=0){
            int cur=qw.poll();
            count++;
            for(int x:rooms.get(cur)){
                if(!visited[x]){
                    visited[x]=true;
                    qw.offer(x);
                }
            }

        }
        if(n==count){
            return true;
        }
        return false;
    }
}