import React from 'react';

const Employee = ({employee}) => {
  return (
            <tr key={employee.id} class="border-slate-200 shadow w-96 border">
            <td class="font-extralight text-center border">{employee.id}</td>
            <td class="font-extralight border pl-4">{employee.name}</td>
            <td class="font-extralight border pl-4">{employee.designation}</td>
            <td class="font-extralight border pl-4">{employee.salary}</td>
          </tr>
  );
}

export default Employee;