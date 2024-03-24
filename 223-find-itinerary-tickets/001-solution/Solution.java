import java.util.*;

/**
 * Find Itinerary from a given list of tickets
 * 
 * Approach: Reverse tickets to find start and then traverse tickets
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public List<String> findItinerary(Map<String, String> tickets) {
        String start = getStart(tickets);

        if (start == null) {
            return null;
        }

        List<String> result = new ArrayList<>();
        result.add(start);

        for (int i = 0; i < tickets.size(); i++) {
            String next = tickets.get(start);
            result.add(next);
            start = next;
        }

        return result;
    }

    private String getStart(Map<String, String> tickets) {
        Map<String, String> reverseTickets = new HashMap<>();

        for (Map.Entry<String, String> entry : tickets.entrySet()) {
            reverseTickets.put(entry.getValue(), entry.getKey());
        }

        for (String from : tickets.keySet()) {
            if (!reverseTickets.containsKey(from)) {
                return from;
            }
        }

        return null;
    }
}

/*
 * Entered tickets:
 * {Chennai=Bengaluru, Mumbai=Delhi, Goa=Chennai, Delhi=Goa}
 * 
 * Result:
 * [Mumbai, Delhi, Goa, Chennai, Bengaluru]
 */
