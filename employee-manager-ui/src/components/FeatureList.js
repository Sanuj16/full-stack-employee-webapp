import React from 'react'
import { useNavigate } from 'react-router-dom';
import AddEmployee from './AddEmployee';

const FeatureList = () => {
    const navigate = useNavigate();
  return (
    <>
    <div class="bg-green-600 h-96">
    <h1 class="text-4xl font-sans text-center py-80 h-96 text-white font-bold block">
      Employee Manager
    </h1>
    </div>
    <div class="flex flex-col justify-center items-center">
      <button class="text-black font-sans block underline" onClick={() => navigate("/employees")}>Employee List</button>
      <button class="text-black font-sans block underline" onClick={() => navigate("/addEmployee")}>Add Employee</button>
    </div>
    </>
  );
}

export default FeatureList;