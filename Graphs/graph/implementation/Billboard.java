package graph.implementation;

import java.util.*;

public class Billboard
{

  static int maxRevenue(int m, int[] x,
                        int[] revenue,
                        int n, int t, ArrayList<Integer> sitelist)
  {


    // Array to store maximum revenue
    // at each miles.
    int[] maxRev = new int[m + 1];
    for(int i = 0; i < m + 1; i++)
      maxRev[i] = 0;

    // actual minimum distance between
    // 2 billboards.
    int nxtbb = 0;
    for (int i = 1; i <= m; i++)
    {
      // check if all billboards are
      // already placed.
      if (nxtbb < n)
      {
        // check if we have billboard for
        // that particular mile. If not,
        // copy the previous maximum revenue.
        if (x[nxtbb] != i)
          maxRev[i] = maxRev[i - 1];

          // we do have billboard for this mile.
        else
        {
          // We have 2 options, we either take
          // current or we ignore current billboard.

          // If current position is less than or
          // equal to t, then we can have only
          // one billboard.
          if (i <= t)
            // 	maxRev[i] = Math.max(maxRev[i - 1],
            // 						revenue[nxtbb]);

            if (revenue[nxtbb] > maxRev[i-1]) {
              maxRev[i] = revenue[nxtbb];
              sitelist.clear();
              sitelist.add(nxtbb);
            }
            else {
              maxRev[i] = maxRev[i-1];
            }

            // Else we may have to remove
            // previously placed billboard
          else
            // 	maxRev[i] = Math.max(maxRev[i - t - 1] +
            // 						revenue[nxtbb],
            // 						maxRev[i - 1]);

            if (maxRev[i-t-1]+revenue[nxtbb] > maxRev[i-1]) {
              maxRev[i] = maxRev[i-t-1]+revenue[nxtbb];
              sitelist.add(nxtbb);
            }
            else
              maxRev[i] = maxRev[i-1];
          nxtbb++;
        }
      }
      else {
        maxRev[i] = maxRev[i - 1];
      }
    }

    return maxRev[m];
  }

  // Driver Code
  public static void main(String []args)
  {
    int m = 34;
    int[] x = new int[]{1, 3, 4, 9, 11, 15, 20, 23, 28, 33};
    int[] revenue = new int[]{8429, 9142, 2732, 5217, 1587, 9613, 7510, 3414, 9006, 4584};
    int n = x.length;
    int t = 5;
    ArrayList<Integer> sitelist = new ArrayList<Integer>();
    System.out.println(maxRevenue(m, x, revenue, n, t, sitelist));
    for(int i=0; i<sitelist.size(); i++){
      System.out.print(sitelist.get(i) + " ");
    }

  }
}

// This code is contributed by Ita_c.
