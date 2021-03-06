package com.whaim.service;

import com.whaim.datagram.DataParser;
import com.whaim.datagram.Datagram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import szfs.std.szfs._2010.tech.xsd.szfs_301_002.Document;

import javax.xml.bind.JAXBException;
import java.io.UnsupportedEncodingException;

/**
 * Created by whaim on 2017/6/28.
 */

@Service
public class Service_szfs301002 implements IService{

    //message type
    private static final String msgType="301.002";

    private Datagram<Document> message;

    @Autowired
    private DataParser<Document> parser=new DataParser<>();

    @Override
    public String getMessageTye() {
        return msgType;
    }

    @Override
    public void process(byte[] msg) {

        try {
            message=parser.parser(msg,Document.class);

            //TODO:  business logic implement  (omitted)...

        } catch (Exception e) {
            e.printStackTrace();
        }


        return;
    }

}
