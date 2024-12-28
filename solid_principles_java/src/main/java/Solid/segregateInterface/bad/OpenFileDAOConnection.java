package Solid.segregateInterface.bad;

public class OpenFileDAOConnection implements BadDAOInterface{
    @Override
    public void openConnection() {
        // we can't open connection in open file
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
