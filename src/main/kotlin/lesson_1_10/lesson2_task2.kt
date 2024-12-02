package lesson_1_10

fun main() {

    val numberOfEmployees = 50
    val numberOfInterns = 30

    val employeeSalary = 30000
    val internSalary = 20000

    val salaryForEmployees = numberOfEmployees * employeeSalary
    val allSalaryExpenses = numberOfInterns * internSalary + salaryForEmployees
    val salaryAverage = allSalaryExpenses / (numberOfEmployees + numberOfInterns)

    println(salaryForEmployees)
    println(allSalaryExpenses)
    println(salaryAverage)
}