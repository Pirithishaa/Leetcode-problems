class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer>qwe=new ArrayList<>();
            arr.add(qwe);
        }
        for(int i=0;i<edges.length;i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }
        boolean visited[]=new boolean[n];
        Queue<Integer>qw=new ArrayDeque<>();
        visited[source]=true;
        qw.offer(source);
        while(qw.size()!=0){
            int cur=qw.poll();
            if(cur==destination){
            return true;
            }
            for(int x:arr.get(cur)){
                if(!visited[x]){
                    visited[x]=true;
                    qw.offer(x);
                }
            }

        }
        return false;
        
    }
}