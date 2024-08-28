class Solution(object):
  def maxProfit(self, prices):
    # Greedy algorithm

    # Set the time to buy stock as the first day in the array
    buy = prices[0]
    maxProfit = prices[0] - buy # Set to 0

    for i in range(1, len(prices)):
      
      # If the current prices are lower than the previous price, set the buy date to the current date to maximize profits. Else, if the current price is greater than the previous price, check if the difference is greater than our current maxProfit, and capture it if it is.
      if prices[i] < buy:
        buy = prices[i]
      elif prices[i] - buy > maxProfit:
        maxProfit = prices[i] - buy

    return maxProfit 
