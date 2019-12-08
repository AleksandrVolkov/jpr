package interf.reader;

import reader.IReader;
import ru.vsu.lab.repository.IRepository;

public class ReaderStreamAPI implements IReader {
    IRepository repository;
    String path;

    public ReaderStreamAPI(IRepository repository, String path) {
        this.repository = repository;
        this.path = path;
    }

    @Override
    public IRepository read() {


        return this.repository;
    }
}
