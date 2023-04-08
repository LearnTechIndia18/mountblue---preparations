import java.io.*;
import java.util.*;

public class Anagram {

	static void solve() throws IOException {
		int tests = nextInt();
		while (tests-- > 0) {
			String s = nextToken();
			int answer = solve(s);
			out.println(answer);
		}
	}

	private static int solve(String s) {
		if ((s.length() & 1) != 0) {
			return -1;
		}
		int k = s.length() >> 1;
		char[] c1 = s.substring(0, k).toCharArray();
		char[] c2 = s.substring(k, 2 * k).toCharArray();
		int[] cnt1 = get(c1);
		int[] cnt2 = get(c2);
		int result = 0;
		for (int i = 0; i < 256; i++) {
			result += Math.abs(cnt1[i] - cnt2[i]);
		}

		return result >> 1;
	}

	private static int[] get(char[] c1) {
		int[] ret = new int[256];
		for (char cc : c1) {
			++ret[cc];
		}
		return ret;
	}

	static BufferedReader br;
	static StringTokenizer st;
	static PrintWriter out;

	public static void main(String[] args) throws IOException {
		InputStream input = System.in;
		PrintStream output = System.out;
		File file = new File("a.in");
		if (file.exists() && file.canRead()) {
			input = new FileInputStream(file);
		}
		br = new BufferedReader(new InputStreamReader(input));
		out = new PrintWriter(output);
		solve();
		out.close();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	static String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = br.readLine();
			if (line == null) {
				return null;
			}
			st = new StringTokenizer(line);
		}
		return st.nextToken();
	}
}






