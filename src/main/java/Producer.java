
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Scanner;

public class Producer {
  //  private static Scanner in;

    public static void main(String[] argv)throws Exception {
        String TestData = "[1,\"d63e2a40-7f7a-475b-9cba-8de6e666ab8f\",\"e6d29a75-cdaf-4dfa-b35d-90c77899eb10\",\"45341692-1ad2-4ed7-b8f2-3e388d973e05\",1522077559207,1,0,{\"tenantId\":\"e6d29a75-cdaf-4dfa-b35d-90c77899eb10\",\"appInstId\":\"45341692-1ad2-4ed7-b8f2-3e388d973e05\",\"appName\":\"Box\",\"action\":\"UPLOADED\",\"eventActor\":\"smithwc6@live.com\",\"resourceId\":\"284945585131\",\"resourceName\":\"notpassdata.txt\",\"resourceSize\":0,\"resourceType\":\"FILE\",\"resourceExtensionType\":\"txt\",\"resourceMimeType\":null,\"resourceOwnerName\":\"smitty.cornwell@oracle.com\",\"resourceOwnerId\":\"1939087316\",\"source\":{\"id\":\"39dd490e-6ff5-463d-a2db-6da26cc4f786\",\"type\":\"webhook_event\",\"tenantId\":\"e6d29a75-cdaf-4dfa-b35d-90c77899eb10\",\"appInstId\":\"45341692-1ad2-4ed7-b8f2-3e388d973e05\",\"rawEvent\":\"{\\\"type\\\":\\\"webhook_event\\\",\\\"id\\\":\\\"39dd490e-6ff5-463d-a2db-6da26cc4f786\\\",\\\"created_at\\\":\\\"2018-03-26T08:16:51-07:00\\\",\\\"trigger\\\":\\\"FILE.UPLOADED\\\",\\\"webhook\\\":{\\\"id\\\":\\\"39383847\\\",\\\"type\\\":\\\"webhook\\\"},\\\"created_by\\\":{\\\"type\\\":\\\"user\\\",\\\"id\\\":\\\"1939107463\\\",\\\"name\\\":\\\"Smith Cornwell\\\",\\\"login\\\":\\\"smithwc6@live.com\\\"},\\\"source\\\":{\\\"id\\\":\\\"284945585131\\\",\\\"type\\\":\\\"file\\\",\\\"file_version\\\":{\\\"type\\\":\\\"file_version\\\",\\\"id\\\":\\\"299823476779\\\",\\\"sha1\\\":\\\"f60a3949ff8740a3bdba0b34da291b04a0147188\\\"},\\\"sequence_id\\\":\\\"0\\\",\\\"etag\\\":\\\"0\\\",\\\"sha1\\\":\\\"f60a3949ff8740a3bdba0b34da291b04a0147188\\\",\\\"name\\\":\\\"notpassdata.txt\\\",\\\"description\\\":\\\"\\\",\\\"size\\\":12734,\\\"path_collection\\\":{\\\"total_count\\\":2,\\\"entries\\\":[{\\\"type\\\":\\\"folder\\\",\\\"id\\\":\\\"0\\\",\\\"sequence_id\\\":null,\\\"etag\\\":null,\\\"name\\\":\\\"All Files\\\"},{\\\"type\\\":\\\"folder\\\",\\\"id\\\":\\\"48169605828\\\",\\\"sequence_id\\\":\\\"0\\\",\\\"etag\\\":\\\"0\\\",\\\"name\\\":\\\"theHook\\\"}]},\\\"created_at\\\":\\\"2018-03-26T08:16:51-07:00\\\",\\\"modified_at\\\":\\\"2018-03-26T08:16:51-07:00\\\",\\\"trashed_at\\\":null,\\\"purged_at\\\":null,\\\"content_created_at\\\":\\\"2018-01-12T12:18:45-08:00\\\",\\\"content_modified_at\\\":\\\"2018-01-12T12:18:45-08:00\\\",\\\"created_by\\\":{\\\"type\\\":\\\"user\\\",\\\"id\\\":\\\"1939107463\\\",\\\"name\\\":\\\"Smith Cornwell\\\",\\\"login\\\":\\\"smithwc6@live.com\\\"},\\\"modified_by\\\":{\\\"type\\\":\\\"user\\\",\\\"id\\\":\\\"1939107463\\\",\\\"name\\\":\\\"Smith Cornwell\\\",\\\"login\\\":\\\"smithwc6@live.com\\\"},\\\"owned_by\\\":{\\\"type\\\":\\\"user\\\",\\\"id\\\":\\\"1939087316\\\",\\\"name\\\":\\\"Smith Cornwell\\\",\\\"login\\\":\\\"smitty.cornwell@oracle.com\\\"},\\\"shared_link\\\":null,\\\"parent\\\":{\\\"type\\\":\\\"folder\\\",\\\"id\\\":\\\"48169605828\\\",\\\"sequence_id\\\":\\\"0\\\",\\\"etag\\\":\\\"0\\\",\\\"name\\\":\\\"theHook\\\"},\\\"item_status\\\":\\\"active\\\"},\\\"additional_info\\\":[]}\",\"trigger\":\"FILE.UPLOADED\",\"webhook\":{\"id\":\"39383847\",\"type\":\"webhook\"},\"source\":{\"id\":\"284945585131\",\"type\":\"file\",\"sha1\":\"f60a3949ff8740a3bdba0b34da291b04a0147188\",\"name\":\"notpassdata.txt\",\"size\":\"12734\",\"owned_by\":{\"id\":\"1939087316\",\"type\":\"user\",\"login\":\"smitty.cornwell@oracle.com\",\"name\":\"Smith Cornwell\"},\"parent\":{\"id\":\"48169605828\",\"type\":\"folder\",\"name\":\"theHook\",\"sequence_id\":\"0\",\"etag\":\"0\"},\"item\":null,\"extension\":\"txt\",\"file_version\":{\"id\":\"299823476779\",\"type\":\"file_version\",\"sha1\":\"f60a3949ff8740a3bdba0b34da291b04a0147188\"},\"path_collection\":{\"entries\":[{\"id\":\"0\",\"type\":\"folder\",\"name\":\"All Files\",\"sequence_id\":null,\"etag\":null},{\"id\":\"48169605828\",\"type\":\"folder\",\"name\":\"theHook\",\"sequence_id\":\"0\",\"etag\":\"0\"}],\"total_count\":\"2\"},\"created_at\":\"2018-03-26T08:16:51-07:00\",\"modified_at\":\"2018-03-26T08:16:51-07:00\",\"content_created_at\":\"2018-01-12T12:18:45-08:00\",\"content_modified_at\":\"2018-01-12T12:18:45-08:00\",\"created_by\":{\"id\":\"1939107463\",\"type\":\"user\",\"login\":\"smithwc6@live.com\",\"name\":\"Smith Cornwell\"},\"modified_by\":{\"id\":\"1939107463\",\"type\":\"user\",\"login\":\"smithwc6@live.com\",\"name\":\"Smith Cornwell\"},\"item_status\":\"active\",\"sequence_id\":\"0\",\"purged_at\":null,\"description\":\"\",\"shared_link\":null,\"etag\":\"0\",\"trashed_at\":null},\"created_at\":\"2018-03-26T08:16:51-07:00\",\"created_by\":{\"id\":\"1939107463\",\"type\":\"user\",\"login\":\"smithwc6@live.com\",\"name\":\"Smith Cornwell\"},\"additional_info\":[]},\"triggerType\":\"WEBHOOK\"}]\n" +
                "\n" +
                "\n";
        if (argv.length != 1) {
            System.err.println("Please specify 1 parameters ");
            System.exit(-1);
        }
        String topicName = argv[0];
      //  in = new Scanner(System.in);
        System.out.println("Enter message(type exit to quit)");

        //Configure the Producer
        Properties configProperties = new Properties();
        configProperties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        configProperties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.ByteArraySerializer");
        configProperties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer");

        org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(configProperties);
        ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName,TestData);
        producer.send(rec);
     //   String line = in.nextLine();
    /*    while(!line.equals("exit")) {
            //TODO: Make sure to use the ProducerRecord constructor that does not take parition Id
            ProducerRecord<String, String> rec = new ProducerRecord<String, String>(topicName,line);
            producer.send(rec);
            line = in.nextLine();
        }*/
   //     in.close();
        producer.close();
    }
}