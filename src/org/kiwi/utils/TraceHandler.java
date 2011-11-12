package org.kiwi.utils;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class TraceHandler implements SOAPHandler<SOAPMessageContext>
{
    @Override
    public boolean handleMessage(SOAPMessageContext messageContext)
    {
        trace(messageContext);
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext messageContext)
    {
        trace(messageContext);
        return true;
    }


    private void trace(SOAPMessageContext messageContext)
    {
        Boolean outMessageIndicator = (Boolean)
        messageContext.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outMessageIndicator.booleanValue())
        {
            System.out.println("Message SOAP en sortie :");
        }
        else
        {
            System.out.println("Message SOAP en arrivée :");
        }

        SOAPMessage message = messageContext.getMessage();
        try
        {
            message.writeTo(System.out);
            System.out.println();
        }
        catch (Exception exp)
        {
            System.out.println("Exception in TraceHandler:trace(messageContext) : " + exp);
        }
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void close(MessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
