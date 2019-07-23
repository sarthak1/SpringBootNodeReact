import React from 'react';
import './App.css';

class App extends React.Component {

    state = {employees:[]};

    componentDidMount() {
    	this.hello();
    }

    hello = () => {
        fetch('/emps')
            .then(response => response.json())
            .then(employees => {
                this.setState({employees: employees});
            });
    };

    render() {
    	const {employees}=this.state;
        return (
            <div className="App">
            	<table><tbody>
		            {
		            	employees.map((employee,key) =>
				           ( <tr key={employee.id}>
				            	<td>{employee.id}</td>
				            	<td>{employee.fullname}</td>
				            	<td>{employee.department}</td>
				            	<td>{employee.salary}</td>            
				            </tr> 
				            )
		            	)
		            }
		            </tbody></table>
            </div>
        );
    }
}


export default App;
