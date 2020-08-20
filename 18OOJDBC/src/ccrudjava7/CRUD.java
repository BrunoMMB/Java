package ccrudjava7;

import java.util.List;

public interface CRUD<T> {

	public T adiciona(T elemento);

	public List<T> lista(T elemento);

	public T altera(T elemento);

	public T exclui(T elemento);
}
