package ru.techcoll.game.unitsSettings;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class UnitInitParser {

   // private static Logger log = Logger.getLogger(UnitInitParser.class);

    public UnitInitList retrieveFromUrl(String url) throws Exception {
        return retrieveFromStream(getDocument(url));
    }

    public UnitInitList retrieveFromStream(InputStream stream) throws Exception {
        DocumentFactory factory = new DocumentFactory();
        SAXReader reader = new SAXReader();
        reader.setDocumentFactory(factory);

        Document document = reader.read(stream);
        Node node = document.selectSingleNode("/units");
        return parseChannel(node);
    }

    public InputStream getDocument(String url) throws Exception {
        //log.info("Reading RSS from " + url);

        URLConnection connection = new URL(url).openConnection();
        return connection.getInputStream();
    }

    protected UnitInitList parseChannel(Node node) {
        UnitInitList channel = new UnitInitList();

        List<Node> nodes = node.selectNodes("unit");
        for (Node n : nodes)
            channel.getItems().add(parseItem(n));

        return channel;
    }

    protected UnitInitItem parseItem(Node node) {
        UnitInitItem item = new UnitInitItem();

        item.setUnitName(node.valueOf("unitName").trim());
        item.setHealth(node.valueOf("health").trim());
        item.setAttack(node.valueOf("attack").trim());
        item.setSpeed(node.valueOf("speed").trim());
        return item;
    }
}
