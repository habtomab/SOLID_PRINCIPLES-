package Solid.segregateInterface.bad;

public class BadDAODBConnection implements BadDAOInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
throw new UnsupportedOperationException("not supported method");
    }

    @Override
    public void deleteRecord() {

    }
}
