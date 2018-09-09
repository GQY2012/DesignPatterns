package composite;

public interface Component {
	void Operation();
}
//叶子节点
interface Leaf extends Component{
	
}
//容器
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}