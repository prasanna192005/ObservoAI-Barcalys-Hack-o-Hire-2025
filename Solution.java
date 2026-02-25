import java.util.*;

public class Solution {

    public static List<Integer> evaluate_deployments(List<String> deployments) {
        int successCount = 0;
        int failCount = 0;
        int errorCount = 0;

        for (String dep : deployments) {
            try {
                dep = dep.trim();
                if (!dep.startsWith("{") || !dep.endsWith("}")) {
                    errorCount++;
                    continue;
                }

                // Remove outer braces
                dep = dep.substring(1, dep.length() - 1).trim();
                String[] fields = dep.split(",");

                String deploymentId = null;
                String status = null;

                for (String field : fields) {
                    String[] parts = field.trim().split(":", 2);
                    if (parts.length != 2) continue;

                    String key = parts[0].trim().replaceAll("^\"|\"$", "");
                    String value = parts[1].trim().replaceAll("^\"|\"$", "");

                    if (key.equals("deployment_id")) {
                        deploymentId = value;
                    } else if (key.equals("status")) {
                        status = value;
                    }
                }

                if (deploymentId == null || status == null) {
                    errorCount++;
                    continue;
                }

                if (!deploymentId.matches("d-[a-z0-9]{10}")) {
                    errorCount++;
                    continue;
                }

                if (status.equals("Success")) {
                    successCount++;
                } else if (status.equals("Fail")) {
                    failCount++;
                } else {
                    errorCount++;
                }

            } catch (Exception e) {
                errorCount++;
            }
        }

        return Arrays.asList(successCount, failCount, errorCount);
    }

    // Main method for HackerRank
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<String> deployments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            deployments.add(scanner.nextLine().trim());
        }

        List<Integer> result = evaluate_deployments(deployments);
        for (int count : result) {
            System.out.println(count);
        }
        scanner.close();
    }
}