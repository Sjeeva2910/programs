public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int start = 0;
        int tank = 0;
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {

            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];

            tank = tank + gas[i];
            tank = tank - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (totalGas < totalCost) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int answer = canCompleteCircuit(gas, cost);

        System.out.println(answer);
    }
}