package com.example.student_manager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AddStudentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)
        val nameField = view.findViewById<EditText>(R.id.etName)
        val idField = view.findViewById<EditText>(R.id.etId)
        val addButton = view.findViewById<Button>(R.id.btnAdd)

        addButton.setOnClickListener {
            val name = nameField.text.toString()
            val id = idField.text.toString()
            if (name.isNotBlank() && id.isNotBlank()) {
                // Giả sử ta thêm trực tiếp vào StudentListFragment (Cần cải thiện)
                Toast.makeText(requireContext(), "Đã thêm sinh viên: $name", Toast.LENGTH_SHORT).show()
                findNavController().navigateUp()
            } else {
                Toast.makeText(requireContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}