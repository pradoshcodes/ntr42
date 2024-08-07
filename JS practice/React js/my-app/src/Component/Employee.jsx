import React from "react";

class Employee extends React.Component {
    render() {
        return (
            <div>
                <h2>Employee Id: {this.props.Id}</h2>
                <h2>Employee Name: {this.props.Name}</h2>
                <h2>Employee Name: {this.props.Salary}</h2>
                <h2>Employee Name: {this.props.Loc}</h2>
            </div>
        );
    }
}

export default Employee;

// let Employee = (props) => {
//     return (
//         <div>
//             <h2>Employee Id:{props.Id}</h2>
//             <h2>Employee Name:{props.Name}</h2>
//         </div>
//     );
// };

 //export default Employee;

