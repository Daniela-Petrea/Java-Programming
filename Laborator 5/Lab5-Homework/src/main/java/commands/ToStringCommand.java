package commands;

import catalog.Catalog;
import exception.CustomException;

import java.io.IOException;

public class ToStringCommand extends GenericCommand{
    public ToStringCommand(Catalog catalog) {
        super(catalog);
        callMethod = "toString method";
    }

    @Override
    public void execute(String stringGiven) throws CustomException, IOException, ClassNotFoundException {
        System.out.println(catalog);
    }


}
