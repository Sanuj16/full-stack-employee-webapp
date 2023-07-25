import React, { useEffect, useState } from 'react'
import EmployeeService from '../services/EmployeeService';
import Employee from './Employee';

const Employees = () => {

    const [employees, setEmployees] = useState([]);

    useEffect(() => {
      const fetchData = async () => {
        try {
            const response = await EmployeeService.getEmployees();
            setEmployees(response.data);
        } catch (error) {
            console.log(error);
        }
      };
      fetchData();
    }, []);
    

  return (
    <div class="flex flex-col justify-center items-center font-sans">
      <div className="px-3 py-6 text-center bg-green-600 tracking-tighter text-white font-thin text-2xl w-full">
        Employee List
      </div>
      <table class="table-auto w-full">
        <thead class="text-white text-2xl shadow-lg bg-green-600 border">
          <tr class="border-slate-400">
            <th class="font-normal border">ID</th>
            <th class="font-normal border">Name</th>
            <th class="font-normal border">Designation</th>
            <th class="font-normal border">Salary</th>
          </tr>
        </thead>
        <tbody class="text-lg text-white bg-slate-400">
            {employees.map( (employee) => (<Employee employee={employee} key={employee.id}></Employee>))}
        </tbody>
      </table>
    </div>
  );
}

export default Employees;