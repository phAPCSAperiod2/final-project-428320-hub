
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




## 🔹 Project Title

## 🔹 What This Software Does
Explain your project in plain language.

## 🔹 Who It’s For
Describe the user and the problem being solved.

## 🔹 How to Run the Program
Clear steps so someone else can run your project.

## 🔹 Technical Overview
Brief description of:
- Main classes
- Key data structures
- Program logic

## 🔹 Class Diagram
Include or link your final class diagram.

## 🔹 Known Limitations / Future Improvements
What works well, and what you would improve with more time.

---

## 🎯 Final Reminder

This repository represents **you as a developer**.

Take pride in:
- Your process
- Your commits
- Your code
- Your documentation

Build something real.
Build it thoughtfully.
Build it well.
