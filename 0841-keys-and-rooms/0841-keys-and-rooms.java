import java.util.*;

class Solution {

    public void dfs(int x, List<List<Integer>> rooms, HashSet<Integer> visited) {
        visited.add(x);

        for (int nei : rooms.get(x)) {
            if (!visited.contains(nei)) {
                dfs(nei, rooms, visited);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();

        dfs(0, rooms, visited); 

        return visited.size() == rooms.size();
    }
}