
---

## BudgetTracker – Personal Finance Management System
---

## Project Overview

BudgetTracker is a personal finance application that helps users track monthly spending, categorize transactions, and analyze their financial habits.
It provides a simple, structured way to enter expenses, view summaries, and understand where money is going each month.

The program uses multiple interacting classes, encapsulation, ArrayLists, enums, and analytical methods — fully meeting AP CSA final project requirements.
---

## Who its for
BudgetTracker is designed for users who want an easy‑to‑use budgeting tool without complicated interfaces. It is especially useful for:

Students learning to manage money

Users who prefer simple  programs

Anyone who wants a clear breakdown of their spending habits
---

## How to Run the Program
- Run the program from the main method inside BudgetManager.java
- Enter your monthly budget limit
- Add transactions (amount, category, description, date)
- Type "done" when finished

- View:
- All transactions
- Total spending
- Whether you are near or over budget
- Next month’s adjusted budget
- Spending by category
- Highest transaction
- Average transaction amount
---

## Technical Overview
## Main Classes
- Budget
- Stores the monthly spending limit and determines whether the user is near or over budget.
Also calculates next month’s adjusted budget.

## BudgetManager
- Manages all transactions using an ArrayList<Transaction>.
- Handles user input, printing, and overall program flow.

## Transaction
 Represents a single financial transaction with:
- amount
- category
- description
- date

## Category (enum)
Defines spending categories:
- GROCERIES
- UTILITIES
- CAR
- ENTERTAINMENT
- OTHER

## ReportGenerator
Analyzes transactions and produces:
- Spending by category
- Transactions in a date range
- Highest transaction
- Average transaction amount

---
## Key Data Structures
- ArrayList<Transaction>
- Stores all user transactions dynamically.

- Enum Category
- Ensures consistent categorization.

- HashMap<Category, Double>
- Used in ReportGenerator to compute spending totals.



## Program Logic Summary
- User enters a monthly budget limit
- User enters transactions until typing "done"
- Program stores each transaction in an ArrayList
- BudgetManager calculates total spending

- Budget evaluates:
- Near limit (≥ 80%)
- Exceeded limit (> 100%)
- ReportGenerator produces:
- Category totals
- Highest transaction
- Average transaction
- Results are printed to the interface.


---
## Class Diagram: https://docs.google.com/presentation/d/1T0IAm-kOLw-gq3-xEJ4m9mICW1EK-kciJq-OXNxrlCQ/edit?usp=sharing

---

## Known Limitations / Future Improvements:
Limitations:
-  all transactions disappear when the program closes, since everything is stored only in memory.
-  requires users to type category names exactly as written, which can easily cause input errors.
-  invalid numbers, dates, or category names to crash the program.
- No income tracking prevents users from recording money earned, so the system only tracks expenses.

Future Improvements:
- Expanding the category system would allow users to create custom categories instead of relying on fixed enums.
- Introducing income and balance tracking would let users see both spending and earnings for a complete financial picture.

---

