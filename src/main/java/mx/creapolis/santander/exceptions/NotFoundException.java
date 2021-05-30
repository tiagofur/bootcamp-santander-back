package mx.creapolis.santander.exceptions;

import mx.creapolis.santander.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
