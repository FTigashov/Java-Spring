package mvc_patient_and_hospital;

public class Assistant implements Services {

    @Override
    public void getMedicalCard() {
        System.out.println("Получена медкарта пациента");
    }

    @Override
    public void getSchedule() {
        System.out.println("Получена информация о враче");
    }

    @Override
    public void sendToDoctor() {
        System.out.println("Пациент отправлен ко врачу");
    }
}
