/**
 * Created by IFatkullina on 21.09.2018.
 * Создание своего собственного протокола: интерфейс Externalizable
 * Вместо реализации интерфейса Serializable,
 * вы можете реализовать интерфейс Externalizable, который содержит два метода:

 public void writeExternal(ObjectOutput out) throws IOException;
 public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException;
 */
package serialize.test2.localMethod;