package leetcode.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Merge Intervals https://leetcode.com/problems/merge-intervals/
 * 
 * @author flipswitch
 *
 */
public class MergeIntervals {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1, 2));
		input.add(new Interval(6, 10));
		input.add(new Interval(15, 18));
		input.add(new Interval(8, 10));
		List<Interval> output = mergeBoundaries(input);
		System.out.println();
		for (int i = 0; i < output.size(); i++) {
			System.out.print(output.get(i).start);
			System.out.print(" " + output.get(i).end);
			System.out.println();
		}

	}

	public static List<Interval> mergeBoundaries(List<Interval> intervals) {

		// Sort by starting timess
		Collections.sort(intervals, new IntervalComparator());

		List<Interval> output = new ArrayList<Interval>();

		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);

			// If they are disconnected, just add previous and move on
			if (prev.end < current.start) {
				output.add(prev);
				prev = current;

				// Else if they are overlapping, take the bigger of the two ends
				// and add the update prev.end with the bigger value.
				// Once it disconnects, we will add the updated prev to output.
			} else {
				prev.end = Math.max(prev.end, current.end);
			}
		}

		// Add the last prev, since the loop exited and you forgot to add it.
		output.add(prev);
		return output;
	}

	/**
	 * Added a custom comparator
	 * 
	 * @author flipswitch
	 *
	 */
	public static class IntervalComparator implements Comparator<Interval> {
		@Override
		public int compare(Interval a, Interval b) {
			return a.start - b.start;
		}

	}

	/**
	 * Interval Class
	 * 
	 * @author flipswitch
	 *
	 */
	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

}
