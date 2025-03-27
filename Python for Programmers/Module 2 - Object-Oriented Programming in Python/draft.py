class Employee:
    ID = None
    salary = None
    department = None

Steve = Employee()

Steve.ID = 3789
Steve.salary = 2500
Steve.department = "Human Resources"
Steve.title = "Manager"

print(f"ID: {Steve.ID}")
print(f"Salary: {Steve.salary}")
print(f"Department: {Steve.department}")
print(f"Title: {Steve.title}")