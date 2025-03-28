class Employee:

    def __init__(self, ID = None, salary = None, department = None):    
        self.ID = ID
        self.salary = salary
        self.department = department

Steve = Employee(3789, 2500, "Human Resources")
Steve.title = "Manager"

Mark = Employee()

print(f"ID: {Steve.ID}")
print(f"Salary: {Steve.salary}")
print(f"Department: {Steve.department}")
print(f"Title: {Steve.title}")

print(f"ID: {Mark.ID}")
print(f"Salary: {Mark.salary}")
print(f"Department: {Mark.department}")