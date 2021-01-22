# TaxCalculator
A tax calculating program that calculates taxes based on if the income is from a company, person, or trust fund. The taxpayers are stored in taxpayers.csv and read into the program then all taxes due are output.
## To install and run:
Clone the repository url: https://github.com/SteveT90/TaxCalculator.git
Import into either Intellij or Eclipse. This project will also run using command line by navigating to TaxCalculator/out/production/TaxCalculator and running: java TaxpayersTest.

## CSV File format:
Company will have tax ID of 0, person will have 1, trust will have 2.
These are used for different tax rates and creating the correct objects for each entity.
### Scenario 1: Tax for a corporation.
Tax ID = 0, company ID, company income. i.e. 0,Sears,650000.23,,,
### Scenario 2: Tax for individual person.
Tax ID = 1, first name, last name, income. i.e. 1,Larry,Cats,42500.65,,
### Scenario 3: Trust fund.
Tax id = 2, first name, last name, personal income, trust id number, trust amount. i.e. 2,Gary,Garrison,8745652.45,GG875,78222
