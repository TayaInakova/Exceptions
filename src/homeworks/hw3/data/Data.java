package homeworks.hw3.data;

import java.util.Scanner;

public class Data {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public Data(String lastName, String firstName, String patronymic, String dateOfBirth, String phoneNumber, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Data() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите через пробел фамилию, имя, отчество, дату рождения (в формате дд.мм.гггг), " +
                "номер телефона и пол (f или m):");
        String str = s.nextLine();
        try {
            String[] dataArray = str.split(" ");
            if (dataArray.length != 6) {
                if (dataArray.length < 6) {
                    throw new RuntimeException("Введено меньше данных, чем необходимо, повторите ввод.");
                } else {
                    throw new RuntimeException("Введено больше данных, чем необходимо, повторите ввод.");
                }
            } else {
                setLastName(dataArray[0]);
                setFirstName(dataArray[1]);
                setPatronymic(dataArray[2]);
                if (dataArray[3].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                    setDateOfBirth(dataArray[3]);
                } else {
                    throw new RuntimeException("Неправильный формат даты, повторите ввод.");
                }
                if (dataArray[4].matches("\\d{11}")) {
                    setPhoneNumber(dataArray[4]);
                } else {
                    throw new RuntimeException("Неправильно указан номер телефона, повторите ввод.");
                }
                if (dataArray[5].equals("f") || dataArray[5].equals("m")) {
                    setGender(dataArray[5]);
                } else {
                    throw new RuntimeException("Неправильно укаан пол, повторите ввод.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            new Data();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Data{" +
                ", lastName='" + lastName + '\'' +
                "firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                '}';
    }
}

